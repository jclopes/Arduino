package processing.app;

import java.io.File;

import javax.swing.text.Document;

public class SketchCodeDoc {

  SketchCode code;
  
  private Document document;

  /**
   * Undo Manager for this tab, each tab keeps track of their own
   * Editor.undo will be set to this object when this code is the tab
   * that's currently the front.
   */
  private LastUndoableEditAwareUndoManager undo = new LastUndoableEditAwareUndoManager();

  public LastUndoableEditAwareUndoManager getUndo() {
    return undo;
  }

  public void setUndo(LastUndoableEditAwareUndoManager undo) {
    this.undo = undo;
  }

  public int getSelectionStart() {
    return selectionStart;
  }

  public void setSelectionStart(int selectionStart) {
    this.selectionStart = selectionStart;
  }

  public int getSelectionStop() {
    return selectionStop;
  }

  public void setSelectionStop(int selectionStop) {
    this.selectionStop = selectionStop;
  }

  public int getScrollPosition() {
    return scrollPosition;
  }

  public void setScrollPosition(int scrollPosition) {
    this.scrollPosition = scrollPosition;
  }

  // saved positions from last time this tab was used
  private int selectionStart;
  private int selectionStop;
  private int scrollPosition;


  public SketchCodeDoc(SketchCode sketchCode, Document doc) {
    code = sketchCode;
    document = doc;
  }

  public SketchCodeDoc(File file) {
    code = new SketchCode(file);
  }

  public SketchCode getCode() {
    return code;
  }

  public void setCode(SketchCode code) {
    this.code = code;
  }

  public Document getDocument() {
    return document;
  }

  public void setDocument(Document document) {
    this.document = document;
  }

}
