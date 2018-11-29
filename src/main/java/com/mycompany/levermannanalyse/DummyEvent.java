/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.levermannanalyse;

/**
 *
 * @author Florian
 */
 import javax.xml.stream.events.XMLEvent;
      import javax.xml.stream.events.Characters;
      import javax.xml.stream.events.EndElement;
      import javax.xml.stream.events.StartElement;
      import javax.xml.namespace.QName;
      import java.io.Writer;
      import javax.xml.stream.Location;
      
      /** DummyEvent is an abstract class. It provides functionality for most of the
   38    * function of XMLEvent.
   39    *
   40    * @author Neeraj Bajaj Sun Microsystems,Inc.
   41    * @author K.Venugopal Sun Microsystems,Inc.
   42    *
   43    */
      
      public abstract class DummyEvent implements XMLEvent {
          // Make sure that getLocation() never returns null. Instead, return this dummy location
          // that indicates "nowhere" as effectively as possible.
          private static DummyLocation nowhere = new DummyLocation();
      
          /* Event type this event corresponds to */
          private int fEventType;
          protected Location fLocation = (Location) nowhere;
      
          public DummyEvent() {
          }
      
          public DummyEvent(int i) {
              fEventType = i;
          }
      
          @Override
          public int getEventType() {
              return fEventType;
              
          }
      
          protected void setEventType(int eventType){
              fEventType = eventType;
          }
      
      
          @Override
          public boolean isStartElement() {
              return fEventType == XMLEvent.START_ELEMENT;
          }
      
          @Override
          public boolean isEndElement() {
              return fEventType == XMLEvent.END_ELEMENT;
          }
  
          @Override
          public boolean isEntityReference() {
              return fEventType == XMLEvent.ENTITY_REFERENCE;
          }
      
          @Override
          public boolean isProcessingInstruction() {
             return fEventType == XMLEvent.PROCESSING_INSTRUCTION;
          }
      
          public boolean isCharacterData() {
              return fEventType == XMLEvent.CHARACTERS;
          }
      
          @Override
          public boolean isStartDocument() {
              return fEventType == XMLEvent.START_DOCUMENT;
          }
      
          @Override
          public boolean isEndDocument() {
              return fEventType == XMLEvent.END_DOCUMENT;
          }
      
          @Override
          public Location getLocation(){
              return fLocation;
         }
     
         void setLocation(Location loc){
             if (loc == null) {
                 fLocation = nowhere;
             } else {
                 fLocation = loc;
             }
         }
     
         /** Returns this event as Characters, may result in
  111        * a class cast exception if this event is not Characters.
  112
     * @return  */
          @Override
         public Characters asCharacters() {
             return (Characters)this;
         }
     
         /** Returns this event as an end  element event, may result in
  118        * a class cast exception if this event is not a end element.
  119
     * @return  */
          @Override
         public EndElement asEndElement() {
             return (EndElement)this;
         }
     
         /** Returns this event as a start element event, may result in
  125        * a class cast exception if this event is not a start element.
  126
     * @return  */
          @Override
         public StartElement asStartElement() {
             return (StartElement)this;
         }
     
         /** This method is provided for implementations to provide
  132        * optional type information about the associated event.
  133        * It is optional and will return null if no information
  134        * is available.
  135
     * @return  */
          @Override
         public QName getSchemaType() {
             //Base class will take care of providing extra information about this event.
             return null;
         }
  
         /** A utility function to check if this event is an Attribute.
  142        * @see Attribute
  143
     * @return  */
          @Override
         public boolean isAttribute() {
             return fEventType == XMLEvent.ATTRIBUTE;
         }
     
         /** A utility function to check if this event is Characters.
  149        * @see Characters
  150
     * @return  */
          @Override
         public boolean isCharacters() {
             return fEventType == XMLEvent.CHARACTERS;
         }
     
         /** A utility function to check if this event is a Namespace.
  156        * @see Namespace
  157
     * @return  */
          @Override
         public boolean isNamespace() {
             return fEventType == XMLEvent.NAMESPACE;
         }
     
         /** This method will write the XMLEvent as per the XML 1.0 specification as Unicode characters.
  163        * No indentation or whitespace should be outputted.
  164        *
  165        * Any user defined event type SHALL have this method
  166        * called when being written to on an output stream.
  167        * Built in Event types MUST implement this method,
  168        * but implementations MAY choose not call these methods
  169        * for optimizations reasons when writing out built in
  170        * Events to an output stream.
  171        * The output generated MUST be equivalent in terms of the
  172        * infoset expressed.
  173        *
  174        * @param writer The writer that will output the data
  175        * @throws XMLStreamException if there is a fatal error writing the event
  176
     * @throws javax.xml.stream.XMLStreamException */
          @Override
         public void writeAsEncodedUnicode(Writer writer) throws javax.xml.stream.XMLStreamException {
         }
     
         static class DummyLocation implements Location {
             public DummyLocation() {
             }
     
             @Override
             public int getCharacterOffset() {
                 return -1;
             }
     
             @Override
             public int getColumnNumber() {
                 return -1;
             }
     
             @Override
            public int getLineNumber() {
               return -1;
            }
  
             @Override
           public String getPublicId() {
         return null;
        }

             @Override
          public String getSystemId() {
              return null;
}
}
}