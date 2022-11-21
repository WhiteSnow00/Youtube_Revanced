import android.view.View;
import com.google.android.setupcompat.logging.CustomEvent;
import android.os.PersistableBundle;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeha implements View$OnClickListener
{
    public final int a;
    public final CharSequence b;
    public int c;
    
    public aeha(final Context context, final AttributeSet set) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, aegk.b);
        this.b = obtainStyledAttributes.getString(1);
        final int int1 = obtainStyledAttributes.getInt(2, 0);
        if (int1 >= 0 && int1 <= 8) {
            this.a = int1;
            this.c = obtainStyledAttributes.getResourceId(0, 0);
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalArgumentException("Not a ButtonType");
    }
    
    public final PersistableBundle a(final String s) {
        final PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString(s.concat("_text"), CustomEvent.h(this.b.toString()));
        String s2 = null;
        switch (this.a) {
            default: {
                s2 = "OTHER";
                break;
            }
            case 8: {
                s2 = "STOP";
                break;
            }
            case 7: {
                s2 = "SKIP";
                break;
            }
            case 6: {
                s2 = "OPT_IN";
                break;
            }
            case 5: {
                s2 = "NEXT";
                break;
            }
            case 4: {
                s2 = "DONE";
                break;
            }
            case 3: {
                s2 = "CLEAR";
                break;
            }
            case 2: {
                s2 = "CANCEL";
                break;
            }
            case 1: {
                s2 = "ADD_ANOTHER";
                break;
            }
        }
        persistableBundle.putString(s.concat("_type"), s2);
        persistableBundle.putInt(s.concat("_onClickCount"), 0);
        return persistableBundle;
    }
    
    public final void onClick(final View view) {
    }
}
