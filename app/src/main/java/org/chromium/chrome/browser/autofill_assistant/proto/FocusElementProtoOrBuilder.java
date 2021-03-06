// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface FocusElementProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.FocusElementProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Element to focus on.
   * </pre>
   *
   * <code>optional .autofill_assistant.ElementReferenceProto element = 1;</code>
   */
  boolean hasElement();
  /**
   * <pre>
   * Element to focus on.
   * </pre>
   *
   * <code>optional .autofill_assistant.ElementReferenceProto element = 1;</code>
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto getElement();

  /**
   * <pre>
   * Optional title to show in the status bar.
   * </pre>
   *
   * <code>optional string title = 2;</code>
   */
  boolean hasTitle();
  /**
   * <pre>
   * Optional title to show in the status bar.
   * </pre>
   *
   * <code>optional string title = 2;</code>
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * Optional title to show in the status bar.
   * </pre>
   *
   * <code>optional string title = 2;</code>
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * Restrict interaction to the area spanned by the given elements.
   * Deprecated: use touchable_element_area instead. Ignored if
   * touchable_element_area is non-empty.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ElementReferenceProto deprecated_touchable_elements = 5;</code>
   */
  java.util.List<org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto> 
      getDeprecatedTouchableElementsList();
  /**
   * <pre>
   * Restrict interaction to the area spanned by the given elements.
   * Deprecated: use touchable_element_area instead. Ignored if
   * touchable_element_area is non-empty.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ElementReferenceProto deprecated_touchable_elements = 5;</code>
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto getDeprecatedTouchableElements(int index);
  /**
   * <pre>
   * Restrict interaction to the area spanned by the given elements.
   * Deprecated: use touchable_element_area instead. Ignored if
   * touchable_element_area is non-empty.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ElementReferenceProto deprecated_touchable_elements = 5;</code>
   */
  int getDeprecatedTouchableElementsCount();

  /**
   * <pre>
   * Restrict interaction to a series of rectangular areas.
   * </pre>
   *
   * <code>optional .autofill_assistant.ElementAreaProto touchable_element_area = 6;</code>
   */
  boolean hasTouchableElementArea();
  /**
   * <pre>
   * Restrict interaction to a series of rectangular areas.
   * </pre>
   *
   * <code>optional .autofill_assistant.ElementAreaProto touchable_element_area = 6;</code>
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ElementAreaProto getTouchableElementArea();
}
