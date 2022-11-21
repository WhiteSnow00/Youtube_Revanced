import java.util.Arrays;
import java.text.AttributedCharacterIterator;
import android.content.res.TypedArray;
import android.util.Xml;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bax
{
    public int a;
    public int b;
    public Object c;
    public Object d;
    
    public bax() {
        this.c = new long[10];
        this.d = new Object[10];
    }
    
    public bax(final Context context, final XmlPullParser xmlPullParser) {
        this.d = new ArrayList();
        this.a = -1;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), aef.h);
        for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
            final int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.b = obtainStyledAttributes.getResourceId(0, this.b);
            }
            else if (index == 1) {
                this.a = obtainStyledAttributes.getResourceId(1, this.a);
                final String resourceTypeName = context.getResources().getResourceTypeName(this.a);
                context.getResources().getResourceName(this.a);
                if ("layout".equals(resourceTypeName)) {
                    final aeb c = new aeb();
                    this.c = c;
                    final int a = this.a;
                    final aeb aeb = c;
                    c.b(context, a);
                }
            }
        }
        obtainStyledAttributes.recycle();
    }
    
    public bax(final Object o, final int n, final int n2) {
        this.g((AttributedCharacterIterator.Attribute)f.a, o, n, n2);
    }
    
    public bax(final AttributedCharacterIterator.Attribute attribute, final Object o, final int n, final int n2) {
        this.g(attribute, o, n, n2);
    }
    
    private final Object h(final long n, final boolean b) {
        long n2 = Long.MAX_VALUE;
        Object i = null;
        while (this.b > 0) {
            final long n3 = n - ((long[])this.c)[this.a];
            if (n3 < 0L && (b || -n3 >= n2)) {
                break;
            }
            i = this.i();
            n2 = n3;
        }
        return i;
    }
    
    private final Object i() {
        bad.f(this.b > 0);
        final Object d = this.d;
        final int a = this.a;
        final Object[] array = (Object[])d;
        final Object o = array[a];
        array[a] = null;
        this.a = (a + 1) % array.length;
        --this.b;
        return o;
    }
    
    public final int a() {
        synchronized (this) {
            return this.b;
        }
    }
    
    public final Object b(final long n) {
        synchronized (this) {
            return this.h(n, false);
        }
    }
    
    public final Object c() {
        synchronized (this) {
            if (this.b == 0) {
                return null;
            }
            return this.i();
        }
    }
    
    public final Object d(final long n) {
        synchronized (this) {
            return this.h(n, true);
        }
    }
    
    public final void e(final long n, final Object o) {
        synchronized (this) {
            final int b = this.b;
            if (b > 0 && n <= ((long[])this.c)[(this.a + b - 1) % ((Object[])this.d).length]) {
                this.f();
            }
            final int length = ((Object[])this.d).length;
            if (this.b >= length) {
                final int n2 = length + length;
                final long[] c = new long[n2];
                final Object[] d = new Object[n2];
                final int a = this.a;
                final int n3 = length - a;
                System.arraycopy(this.c, a, c, 0, n3);
                System.arraycopy(this.d, this.a, d, 0, n3);
                final int a2 = this.a;
                if (a2 > 0) {
                    System.arraycopy(this.c, 0, c, n3, a2);
                    System.arraycopy(this.d, 0, d, n3, this.a);
                }
                this.c = c;
                this.d = d;
                this.a = 0;
            }
            final int a3 = this.a;
            final int b2 = this.b;
            final Object d2 = this.d;
            final int n4 = (a3 + b2) % ((Object[])d2).length;
            ((long[])this.c)[n4] = n;
            ((Object[])d2)[n4] = o;
            this.b = b2 + 1;
        }
    }
    
    public final void f() {
        synchronized (this) {
            this.a = 0;
            this.b = 0;
            Arrays.fill((Object[])this.d, null);
        }
    }
    
    public final void g(final AttributedCharacterIterator.Attribute d, final Object c, final int b, final int a) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
}
