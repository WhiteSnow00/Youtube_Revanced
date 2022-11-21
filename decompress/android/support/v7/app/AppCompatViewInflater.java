// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v7.app;

import java.lang.reflect.Constructor;
import android.view.View;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.content.Context;

public class AppCompatViewInflater
{
    public static final int[] a;
    public static final int[] b;
    public static final int[] c;
    public static final int[] d;
    public static final String[] e;
    private static final Class[] g;
    private static final abp h;
    public final Object[] f;
    
    static {
        g = new Class[] { Context.class, AttributeSet.class };
        a = new int[] { 16843375 };
        b = new int[] { 16844160 };
        c = new int[] { 16844156 };
        d = new int[] { 16844148 };
        e = new String[] { "android.widget.", "android.view.", "android.webkit." };
        h = new abp();
    }
    
    public AppCompatViewInflater() {
        this.f = new Object[2];
    }
    
    public ka a(final Context context, final AttributeSet set) {
        return new ka(context, set);
    }
    
    public AppCompatButton b(final Context context, final AttributeSet set) {
        return new AppCompatButton(context, set);
    }
    
    public kc c(final Context context, final AttributeSet set) {
        return new kc(context, set);
    }
    
    public kl d(final Context context, final AttributeSet set) {
        return new kl(context, set);
    }
    
    public AppCompatTextView e(final Context context, final AttributeSet set) {
        return new AppCompatTextView(context, set);
    }
    
    public final View f(final Context context, final String s, String string) {
        final abp h = AppCompatViewInflater.h;
        Label_0095: {
            Constructor<? extends View> constructor;
            if ((constructor = (Constructor)h.get((Object)s)) != null) {
                break Label_0095;
            }
            Label_0062: {
                if (string == null) {
                    break Label_0062;
                }
                try {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(string);
                    sb.append(s);
                    string = sb.toString();
                    while (true) {
                        constructor = Class.forName(string, false, context.getClassLoader()).asSubclass(View.class).getConstructor((Class<?>[])AppCompatViewInflater.g);
                        h.put((Object)s, (Object)constructor);
                        constructor.setAccessible(true);
                        return (View)constructor.newInstance(this.f);
                        string = s;
                        continue;
                    }
                }
                catch (final Exception ex) {
                    return null;
                }
            }
        }
    }
}
