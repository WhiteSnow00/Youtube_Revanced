import android.content.res.TypedArray;
import android.widget.TextView;
import android.view.inputmethod.InputConnection;
import android.util.AttributeSet;
import android.view.View;
import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.Map;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import android.text.method.NumberKeyListener;
import android.text.method.KeyListener;
import android.util.ArrayMap;
import java.io.File;
import java.util.ArrayList;
import android.widget.EditText;
import java.util.HashMap;
import android.os.Handler;
import android.os.Bundle;
import java.util.HashSet;
import java.util.LinkedHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bac
{
    public final Object a;
    public final Object b;
    
    public bac() {
        this.a = new Object();
        this.b = new LinkedHashMap();
        new HashSet();
    }
    
    public bac(final Bundle b) {
        this.a = "__EMPTY_ROOT__";
        this.b = b;
    }
    
    public bac(final Handler a) {
        this.b = new HashMap();
        this.a = a;
    }
    
    public bac(final EditText a) {
        this.a = a;
        this.b = new avv(a);
    }
    
    public bac(final auk a) {
        this.a = a;
        this.b = new ArrayList();
    }
    
    public bac(final File a) {
        this.a = a;
        this.b = new File(String.valueOf(a.getPath()).concat(".bak"));
    }
    
    public bac(final String a) {
        this.b = new LinkedHashMap();
        this.a = a;
    }
    
    public bac(final qa b) {
        this.b = b;
        this.a = new arjj(null);
    }
    
    public bac(final re a, final rm b) {
        this.a = a;
        this.b = b;
    }
    
    public bac(final wb a) {
        this.b = new ArrayMap(4);
        this.a = a;
    }
    
    public static final boolean j(final KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }
    
    public static final KeyListener k(final KeyListener keyListener) {
        KeyListener keyListener2 = keyListener;
        if (j(keyListener)) {
            if (keyListener instanceof asv) {
                keyListener2 = keyListener;
            }
            else if (keyListener == null) {
                keyListener2 = null;
            }
            else {
                keyListener2 = keyListener;
                if (!(keyListener instanceof NumberKeyListener)) {
                    return (KeyListener)new asv(keyListener);
                }
            }
        }
        return keyListener2;
    }
    
    public final InputStream a() {
        if (((File)this.b).exists()) {
            ((File)this.a).delete();
            ((File)this.b).renameTo((File)this.a);
        }
        return new FileInputStream((File)this.a);
    }
    
    public final OutputStream b() {
        if (((File)this.a).exists()) {
            if (!((File)this.b).exists()) {
                if (!((File)this.a).renameTo((File)this.b)) {
                    final String string = this.a.toString();
                    final String string2 = this.b.toString();
                    final StringBuilder sb = new StringBuilder("Couldn't rename file ");
                    sb.append(string);
                    sb.append(" to backup file ");
                    sb.append(string2);
                    baq.c("AtomicFile", sb.toString());
                }
            }
            else {
                ((File)this.a).delete();
            }
        }
        try {
            return new bab((File)this.a);
        }
        catch (final FileNotFoundException ex) {
            final File parentFile = ((File)this.a).getParentFile();
            if (parentFile != null && parentFile.mkdirs()) {
                try {
                    return new bab((File)this.a);
                }
                catch (final FileNotFoundException ex2) {
                    throw new IOException("Couldn't create ".concat(this.a.toString()), ex2);
                }
            }
            throw new IOException("Couldn't create ".concat(this.a.toString()), ex);
        }
    }
    
    public final void c() {
        ((File)this.a).delete();
        ((File)this.b).delete();
    }
    
    public final void d(final OutputStream outputStream) {
        outputStream.close();
        ((File)this.b).delete();
    }
    
    public final zo e() {
        final zo zo = new zo();
        final ArrayList list = new ArrayList();
        final Iterator<Map.Entry<Object, Object>> iterator = ((Map<Object, Object>)this.b).entrySet().iterator();
        if (!iterator.hasNext()) {
            new StringBuilder("All use case: ").append(list);
            final String s = (String)this.a;
            return zo;
        }
        final rq rq = iterator.next().getValue();
        throw null;
    }
    
    public final LinkedHashSet f() {
        synchronized (this.a) {
            return new LinkedHashSet(((Map<K, ? extends E>)this.b).values());
        }
    }
    
    public final View g(final int n, final int n2, final int n3, final int n4) {
        final int d = ((qa)this.b).d();
        final int c = ((qa)this.b).c();
        View view = null;
        View view2;
        int n5;
        for (int i = n; i != n2; i += n5, view = view2) {
            final View e = ((qa)this.b).e(i);
            ((arjj)this.a).d(d, c, ((qa)this.b).b(e), ((qa)this.b).a(e));
            ((arjj)this.a).c();
            ((arjj)this.a).b(n3);
            final arjj arjj = (arjj)this.a;
            if (arjj.e()) {
                return e;
            }
            view2 = view;
            if (n4 != 0) {
                arjj.c();
                ((arjj)this.a).b(n4);
                view2 = view;
                if (((arjj)this.a).e()) {
                    view2 = e;
                }
            }
            if (n2 > n) {
                n5 = 1;
            }
            else {
                n5 = -1;
            }
        }
        return view;
    }
    
    public final boolean h(final View view) {
        ((arjj)this.a).d(((qa)this.b).d(), ((qa)this.b).c(), ((qa)this.b).b(view), ((qa)this.b).a(view));
        ((arjj)this.a).c();
        ((arjj)this.a).b(24579);
        return ((arjj)this.a).e();
    }
    
    public final void i(AttributeSet obtainStyledAttributes, final int n) {
        obtainStyledAttributes = (AttributeSet)((EditText)this.a).getContext().obtainStyledAttributes(obtainStyledAttributes, gm.i, n, 0);
        try {
            final boolean hasValue = ((TypedArray)obtainStyledAttributes).hasValue(14);
            boolean boolean1 = true;
            if (hasValue) {
                boolean1 = ((TypedArray)obtainStyledAttributes).getBoolean(14, true);
            }
            ((TypedArray)obtainStyledAttributes).recycle();
            obtainStyledAttributes = (AttributeSet)((kh)((avv)this.b).a).a;
            if (((asy)obtainStyledAttributes).a != boolean1 && (((asy)obtainStyledAttributes).a = boolean1)) {
                asp.a();
                throw null;
            }
        }
        finally {
            ((TypedArray)obtainStyledAttributes).recycle();
        }
    }
    
    public final InputConnection l(final InputConnection inputConnection) {
        final Object b = this.b;
        if (inputConnection == null) {
            return null;
        }
        final Object a = ((avv)b).a;
        if (inputConnection instanceof asu) {
            return inputConnection;
        }
        return (InputConnection)new asu((TextView)((kh)a).b, inputConnection);
    }
    
    public final kh m(final String s) {
        synchronized (this.b) {
            kh kh;
            if ((kh = ((Map<K, kh>)this.b).get(s)) == null) {
                try {
                    kh = new kh(((wb)this.a).a(s));
                    ((Map<String, kh>)this.b).put(s, kh);
                }
                catch (final AssertionError assertionError) {
                    throw new vm(assertionError.getMessage(), (Throwable)assertionError);
                }
            }
            return kh;
        }
    }
}
