import android.view.inputmethod.InputConnection;
import android.text.Selection;
import android.view.KeyEvent;
import android.text.Editable;
import android.view.View;
import android.widget.PopupWindow;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apr
{
    public static void a(final PopupWindow popupWindow, final View view, final int n, final int n2, final int n3) {
        popupWindow.showAsDropDown(view, n, n2, n3);
    }
    
    public static boolean b(final Editable editable, final KeyEvent keyEvent, final boolean b) {
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            final int selectionStart = Selection.getSelectionStart((CharSequence)editable);
            final int selectionEnd = Selection.getSelectionEnd((CharSequence)editable);
            if (d(selectionStart, selectionEnd)) {
                return false;
            }
            final asq[] array = (asq[])editable.getSpans(selectionStart, selectionEnd, (Class)asq.class);
            if (array != null) {
                final int length = array.length;
                if (length > 0) {
                    int i = 0;
                    while (i < length) {
                        final asq asq = array[i];
                        final int spanStart = editable.getSpanStart((Object)asq);
                        final int spanEnd = editable.getSpanEnd((Object)asq);
                        Label_0135: {
                            if (b) {
                                if (spanStart == selectionStart) {
                                    break Label_0135;
                                }
                            }
                            else if (spanEnd == selectionStart) {
                                break Label_0135;
                            }
                            if (selectionStart <= spanStart || selectionStart >= spanEnd) {
                                ++i;
                                continue;
                            }
                        }
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public static boolean c(final InputConnection inputConnection, final Editable editable, int n, int n2, final boolean b) {
        if (editable != null && n >= 0) {
            if (n2 >= 0) {
                final int selectionStart = Selection.getSelectionStart((CharSequence)editable);
                final int selectionEnd = Selection.getSelectionEnd((CharSequence)editable);
                if (d(selectionStart, selectionEnd)) {
                    return false;
                }
                if (b) {
                    final int max = Math.max(n, 0);
                    n = ((CharSequence)editable).length();
                    Label_0200: {
                        Label_0198: {
                            if (selectionStart >= 0) {
                                if (n >= selectionStart) {
                                    n = selectionStart;
                                    int n3;
                                    if ((n3 = max) >= 0) {
                                        while (true) {
                                            int n4 = 0;
                                            int n5 = n3;
                                            int n6 = n;
                                            while (true) {
                                                n = n6;
                                                if (n5 == 0) {
                                                    break Label_0200;
                                                }
                                                n = n6 - 1;
                                                if (n < 0) {
                                                    if (n4 != 0) {
                                                        break Label_0198;
                                                    }
                                                    n = 0;
                                                    break Label_0200;
                                                }
                                                else {
                                                    final char char1 = ((CharSequence)editable).charAt(n);
                                                    if (n4 != 0) {
                                                        if (!Character.isHighSurrogate(char1)) {
                                                            break Label_0198;
                                                        }
                                                        n3 = n5 - 1;
                                                        break;
                                                    }
                                                    else if (!Character.isSurrogate(char1)) {
                                                        --n5;
                                                        n6 = n;
                                                    }
                                                    else {
                                                        if (Character.isHighSurrogate(char1)) {
                                                            break Label_0198;
                                                        }
                                                        n4 = 1;
                                                        n6 = n;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        n = -1;
                    }
                    final int max2 = Math.max(n2, 0);
                    final int length = ((CharSequence)editable).length();
                    Label_0346: {
                        Label_0344: {
                            if (selectionEnd >= 0) {
                                if (length >= selectionEnd) {
                                    n2 = selectionEnd;
                                    int i;
                                    if ((i = max2) >= 0) {
                                    Label_0245:
                                        while (true) {
                                            int n7 = 0;
                                            while (i != 0) {
                                                if (n2 >= length) {
                                                    n2 = length;
                                                    if (n7 != 0) {
                                                        break Label_0344;
                                                    }
                                                    break;
                                                }
                                                else {
                                                    final char char2 = ((CharSequence)editable).charAt(n2);
                                                    if (n7 != 0) {
                                                        if (!Character.isLowSurrogate(char2)) {
                                                            break Label_0344;
                                                        }
                                                        ++n2;
                                                        --i;
                                                        continue Label_0245;
                                                    }
                                                    else if (!Character.isSurrogate(char2)) {
                                                        ++n2;
                                                        --i;
                                                    }
                                                    else {
                                                        if (Character.isLowSurrogate(char2)) {
                                                            break Label_0344;
                                                        }
                                                        ++n2;
                                                        n7 = 1;
                                                    }
                                                }
                                            }
                                            break Label_0346;
                                        }
                                    }
                                }
                            }
                        }
                        n2 = -1;
                    }
                    if (n == -1 || n2 == -1) {
                        return false;
                    }
                }
                else {
                    n = Math.max(selectionStart - n, 0);
                    n2 = Math.min(selectionEnd + n2, editable.length());
                }
                final asq[] array = (asq[])editable.getSpans(n, n2, (Class)asq.class);
                if (array != null) {
                    final int length2 = array.length;
                    if (length2 > 0) {
                        for (final asq asq : array) {
                            final int spanStart = editable.getSpanStart((Object)asq);
                            final int spanEnd = editable.getSpanEnd((Object)asq);
                            n = Math.min(spanStart, n);
                            n2 = Math.max(spanEnd, n2);
                        }
                        n = Math.max(n, 0);
                        n2 = Math.min(n2, editable.length());
                        inputConnection.beginBatchEdit();
                        editable.delete(n, n2);
                        inputConnection.endBatchEdit();
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    private static boolean d(final int n, final int n2) {
        return n == -1 || n2 == -1 || n != n2;
    }
}
