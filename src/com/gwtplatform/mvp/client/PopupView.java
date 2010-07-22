package com.gwtplatform.mvp.client;


/**
 * The interface for {@link View} classes that is meant to be displayed as a popup, 
 * like a GWT {@link com.google.gwt.user.client.ui.PopupPanel} or a 
 * {@link com.google.gwt.user.client.ui.DialogBox}.
 * 
 * @author Philippe Beaudoin
 */
public interface PopupView extends View {

  /**
   * <b>Important!</b> Do not call this directly, instead use
   * {@link PresenterWidgetImpl#addPopupContent(PresenterWidget)} passing this view's
   * {@link PresenterWidget}.
   * <p/>
   * Make sure the {@link PopupView} is visible. 
   */
  public void show();
  
  /**
   * Make sure the {@link PopupView} is hidden. You can call this method directly.
   */
  public void hide();
  
  /**
   * Make sure the {@link PopupView} is centered in the browser's client area. 
   * This method should not change the view visibility:
   * if it was hidden (resp. visible) it remains hidden (resp. visible).
   */
  public void center();
  
  /**
   * Reposition the {@link PopupView} within the browser's client area.
   * This method should not change the view visibility:
   * if it was hidden (resp. visible) it remains hidden (resp. visible).
   * 
   * @param left The left position of the top-left corner (in pixels).
   * @param top The top position of the top-left corner (in pixels).
   */
  public void setPosition( int left, int top );

  /**
   * Identifies which {@link PopupViewCloseHandler} should be called
   * when this view closed (either automatically or through a call
   * to {@link #hide()}. 
   * 
   * @param popupViewCloseHandler The {@link PopupViewCloseHandler} or {@code null} to unregister any handlers.
   */
  public void setCloseHandler(
      PopupViewCloseHandler popupViewCloseHandler);
  
  /**
   * Indicates that the view should automatically hide when a GWTP
   * {@link com.gwtplatform.mvp.client.proxy.NavigationEvent} is fired.
   * This is better than using GWT's {@link com.google.gwt.user.client.ui.PopupPanel#setAutoHideOnHistoryEventsEnabled(boolean)}
   * since the latter will automatically hide the dialog even if navigation is refused through
   * {@link com.gwtplatform.mvp.client.proxy.PlaceManager#setOnLeaveConfirmation(String)}.
   */
  public void setAutoHideOnNavigationEventEnabled( boolean autoHide );  
  
}