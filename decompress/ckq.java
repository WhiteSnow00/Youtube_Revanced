import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import android.os.Parcelable;
import android.util.SparseIntArray;
import android.os.Parcel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ckq
{
    final abp a;
    final abp b;
    final abp c;
    public final Parcel d;
    private final SparseIntArray e;
    private final int f;
    private final int g;
    private final String h;
    private int i;
    private int j;
    private int k;
    
    public ckq(final Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new abp(), new abp(), new abp());
    }
    
    private ckq(final Parcel d, final int n, final int g, final String h, final abp a, final abp b, final abp c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = new SparseIntArray();
        this.i = -1;
        this.k = -1;
        this.d = d;
        this.f = n;
        this.g = g;
        this.j = n;
        this.h = h;
    }
    
    private final Class v(final Class clazz) {
        Class<?> forName;
        if ((forName = (Class)this.c.get((Object)clazz.getName())) == null) {
            forName = Class.forName(String.format("%s.%sParcelizer", clazz.getPackage().getName(), clazz.getSimpleName()), false, clazz.getClassLoader());
            this.c.put((Object)clazz.getName(), (Object)forName);
        }
        return forName;
    }
    
    public final int a(final int n, final int n2) {
        if (!this.s(n2)) {
            return n;
        }
        return this.d.readInt();
    }
    
    public final Parcelable b(final Parcelable parcelable, final int n) {
        if (!this.s(n)) {
            return parcelable;
        }
        return this.d.readParcelable(this.getClass().getClassLoader());
    }
    
    public final ckr c() {
        final String n = this.n();
        if (n == null) {
            return null;
        }
        final ckq m = this.m();
        try {
            Method declaredMethod;
            if ((declaredMethod = (Method)this.a.get((Object)n)) == null) {
                declaredMethod = Class.forName(n, true, ckq.class.getClassLoader()).getDeclaredMethod("read", ckq.class);
                this.a.put((Object)n, (Object)declaredMethod);
            }
            return (ckr)declaredMethod.invoke(null, m);
        }
        catch (final ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        }
        catch (final NoSuchMethodException ex2) {
            throw new RuntimeException(ex2);
        }
        catch (final InvocationTargetException ex3) {
            final Throwable cause = ex3.getCause();
            if (cause instanceof RuntimeException) {
                throw (RuntimeException)cause;
            }
            if (cause instanceof Error) {
                throw (Error)cause;
            }
            throw new RuntimeException(ex3);
        }
        catch (final IllegalAccessException ex4) {
            throw new RuntimeException(ex4);
        }
    }
    
    public final CharSequence d(final CharSequence charSequence, final int n) {
        if (!this.s(n)) {
            return charSequence;
        }
        return (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.d);
    }
    
    public final String e(final String s, final int n) {
        if (!this.s(n)) {
            return s;
        }
        return this.n();
    }
    
    public final void f(final boolean b, final int n) {
        this.p(n);
        this.d.writeInt((int)(b ? 1 : 0));
    }
    
    public final void g(final CharSequence charSequence, final int n) {
        this.p(n);
        TextUtils.writeToParcel(charSequence, this.d, 0);
    }
    
    public final void h(final int n, final int n2) {
        this.p(n2);
        this.q(n);
    }
    
    public final void i(final Parcelable parcelable, final int n) {
        this.p(n);
        this.d.writeParcelable(parcelable, 0);
    }
    
    public final void j(final String s, final int n) {
        this.p(n);
        this.r(s);
    }
    
    public final void k(final ckr ex) {
        if (ex != null) {
            try {
                this.r(this.v(ex.getClass()).getName());
                final ckq m = this.m();
                try {
                    final Class<? extends ClassNotFoundException> class1 = ex.getClass();
                    Method declaredMethod;
                    if ((declaredMethod = (Method)this.b.get((Object)class1.getName())) == null) {
                        declaredMethod = this.v(class1).getDeclaredMethod("write", class1, ckq.class);
                        this.b.put((Object)class1.getName(), (Object)declaredMethod);
                    }
                    declaredMethod.invoke(null, ex, m);
                    m.o();
                    return;
                }
                catch (final ClassNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
                catch (final NoSuchMethodException ex) {
                    throw new RuntimeException(ex);
                }
                catch (final InvocationTargetException ex) {
                    final Throwable cause = ((InvocationTargetException)ex).getCause();
                    if (cause instanceof RuntimeException) {
                        throw (RuntimeException)cause;
                    }
                    if (cause instanceof Error) {
                        throw (Error)cause;
                    }
                    throw new RuntimeException(ex);
                }
                catch (final IllegalAccessException ex) {
                    throw new RuntimeException(ex);
                }
            }
            catch (final ClassNotFoundException ex2) {
                throw new RuntimeException(String.valueOf(ex.getClass().getSimpleName()).concat(" does not have a Parcelizer"), ex2);
            }
        }
        this.r(null);
    }
    
    public final boolean l(boolean b, final int n) {
        if (this.s(n)) {
            if (this.d.readInt() != 0) {
                return true;
            }
            b = false;
        }
        return b;
    }
    
    protected final ckq m() {
        final Parcel d = this.d;
        final int dataPosition = d.dataPosition();
        int n;
        if ((n = this.j) == this.f) {
            n = this.g;
        }
        return new ckq(d, dataPosition, n, this.h.concat("  "), this.a, this.b, this.c);
    }
    
    public final String n() {
        return this.d.readString();
    }
    
    public final void o() {
        final int i = this.i;
        if (i >= 0) {
            final int value = this.e.get(i);
            final int dataPosition = this.d.dataPosition();
            this.d.setDataPosition(value);
            this.d.writeInt(dataPosition - value);
            this.d.setDataPosition(dataPosition);
        }
    }
    
    public final void p(final int i) {
        this.o();
        this.i = i;
        this.e.put(i, this.d.dataPosition());
        this.q(0);
        this.q(i);
    }
    
    public final void q(final int n) {
        this.d.writeInt(n);
    }
    
    public final void r(final String s) {
        this.d.writeString(s);
    }
    
    public final boolean s(final int n) {
        while (this.j < this.g) {
            final int k = this.k;
            if (k == n) {
                return true;
            }
            if (String.valueOf(k).compareTo(String.valueOf(n)) > 0) {
                return false;
            }
            this.d.setDataPosition(this.j);
            final int int1 = this.d.readInt();
            this.k = this.d.readInt();
            this.j += int1;
        }
        return this.k == n;
    }
    
    public final ckr t(final ckr ckr) {
        if (!this.s(1)) {
            return ckr;
        }
        return this.c();
    }
    
    public final void u(final ckr ckr) {
        this.p(1);
        this.k(ckr);
    }
}
