import java.lang.reflect.Array;
import android.text.Editable;
import java.util.ArrayList;
import java.util.List;
import android.text.SpannableStringBuilder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aso extends SpannableStringBuilder
{
    private final Class a;
    private final List b;
    
    public aso(final Class a, final CharSequence charSequence) {
        super(charSequence);
        this.b = new ArrayList();
        this.a = a;
    }
    
    public aso(final Class a, final CharSequence charSequence, final int n, final int n2) {
        super(charSequence, n, n2);
        this.b = new ArrayList();
        afc.k(a, "watcherClass cannot be null");
        this.a = a;
    }
    
    private final asn c(final Object o) {
        for (int i = 0; i < this.b.size(); ++i) {
            final asn asn = this.b.get(i);
            if (asn.a == o) {
                return asn;
            }
        }
        return null;
    }
    
    private final void d() {
        for (int i = 0; i < this.b.size(); ++i) {
            ((asn)this.b.get(i)).b.decrementAndGet();
        }
    }
    
    private final boolean e(final Class clazz) {
        return this.a == clazz;
    }
    
    private final boolean f(final Object o) {
        return o != null && this.e(o.getClass());
    }
    
    public final void a() {
        for (int i = 0; i < this.b.size(); ++i) {
            ((asn)this.b.get(i)).b.incrementAndGet();
        }
    }
    
    public final Editable append(final char c) {
        super.append(c);
        return (Editable)this;
    }
    
    public final Editable append(final CharSequence charSequence) {
        super.append(charSequence);
        return (Editable)this;
    }
    
    public final Editable append(final CharSequence charSequence, final int n, final int n2) {
        super.append(charSequence, n, n2);
        return (Editable)this;
    }
    
    public final SpannableStringBuilder append(final char c) {
        super.append(c);
        return this;
    }
    
    public final SpannableStringBuilder append(final CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }
    
    public final SpannableStringBuilder append(final CharSequence charSequence, final int n, final int n2) {
        super.append(charSequence, n, n2);
        return this;
    }
    
    public final SpannableStringBuilder append(final CharSequence charSequence, final Object o, final int n) {
        super.append(charSequence, o, n);
        return this;
    }
    
    public final Appendable append(final char c) {
        super.append(c);
        return (Appendable)this;
    }
    
    public final Appendable append(final CharSequence charSequence) {
        super.append(charSequence);
        return (Appendable)this;
    }
    
    public final Appendable append(final CharSequence charSequence, final int n, final int n2) {
        super.append(charSequence, n, n2);
        return (Appendable)this;
    }
    
    public final void b() {
        this.d();
        for (int i = 0; i < this.b.size(); ++i) {
            ((asn)this.b.get(i)).onTextChanged((CharSequence)this, 0, this.length(), this.length());
        }
    }
    
    public final Editable delete(final int n, final int n2) {
        super.delete(n, n2);
        return (Editable)this;
    }
    
    public final SpannableStringBuilder delete(final int n, final int n2) {
        super.delete(n, n2);
        return this;
    }
    
    public final int getSpanEnd(final Object o) {
        Object o2 = o;
        if (this.f(o)) {
            final asn c = this.c(o);
            o2 = o;
            if (c != null) {
                o2 = c;
            }
        }
        return super.getSpanEnd(o2);
    }
    
    public final int getSpanFlags(final Object o) {
        Object o2 = o;
        if (this.f(o)) {
            final asn c = this.c(o);
            o2 = o;
            if (c != null) {
                o2 = c;
            }
        }
        return super.getSpanFlags(o2);
    }
    
    public final int getSpanStart(final Object o) {
        Object o2 = o;
        if (this.f(o)) {
            final asn c = this.c(o);
            o2 = o;
            if (c != null) {
                o2 = c;
            }
        }
        return super.getSpanStart(o2);
    }
    
    public final Object[] getSpans(int i, final int n, final Class clazz) {
        if (this.e(clazz)) {
            final asn[] array = (asn[])super.getSpans(i, n, (Class)asn.class);
            final Object[] array2 = (Object[])Array.newInstance(clazz, array.length);
            for (i = 0; i < array.length; ++i) {
                array2[i] = array[i].a;
            }
            return array2;
        }
        return super.getSpans(i, n, clazz);
    }
    
    public final Editable insert(final int n, final CharSequence charSequence) {
        super.insert(n, charSequence);
        return (Editable)this;
    }
    
    public final Editable insert(final int n, final CharSequence charSequence, final int n2, final int n3) {
        super.insert(n, charSequence, n2, n3);
        return (Editable)this;
    }
    
    public final SpannableStringBuilder insert(final int n, final CharSequence charSequence) {
        super.insert(n, charSequence);
        return this;
    }
    
    public final SpannableStringBuilder insert(final int n, final CharSequence charSequence, final int n2, final int n3) {
        super.insert(n, charSequence, n2, n3);
        return this;
    }
    
    public final int nextSpanTransition(final int n, final int n2, final Class clazz) {
        Class<asn> clazz2 = clazz;
        if (this.e(clazz)) {
            clazz2 = asn.class;
        }
        return super.nextSpanTransition(n, n2, (Class)clazz2);
    }
    
    public final void removeSpan(Object o) {
        asn asn;
        if (this.f(o)) {
            final asn c = this.c(o);
            if ((asn = c) != null) {
                o = c;
                asn = c;
            }
        }
        else {
            asn = null;
        }
        super.removeSpan(o);
        if (asn != null) {
            this.b.remove(asn);
        }
    }
    
    public final /* bridge */ Editable replace(final int n, final int n2, final CharSequence charSequence) {
        this.replace(n, n2, charSequence);
        return (Editable)this;
    }
    
    public final /* bridge */ Editable replace(final int n, final int n2, final CharSequence charSequence, final int n3, final int n4) {
        this.replace(n, n2, charSequence, n3, n4);
        return (Editable)this;
    }
    
    public final SpannableStringBuilder replace(final int n, final int n2, final CharSequence charSequence) {
        this.a();
        super.replace(n, n2, charSequence);
        this.d();
        return this;
    }
    
    public final SpannableStringBuilder replace(final int n, final int n2, final CharSequence charSequence, final int n3, final int n4) {
        this.a();
        super.replace(n, n2, charSequence, n3, n4);
        this.d();
        return this;
    }
    
    public final void setSpan(final Object o, final int n, final int n2, final int n3) {
        Object o2 = o;
        if (this.f(o)) {
            o2 = new asn(o);
            this.b.add(o2);
        }
        super.setSpan(o2, n, n2, n3);
    }
    
    public final CharSequence subSequence(final int n, final int n2) {
        return (CharSequence)new aso(this.a, (CharSequence)this, n, n2);
    }
}
