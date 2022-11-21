import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahcx extends ahci
{
    public final MessageLite a;
    final Object b;
    public final MessageLite c;
    public final ahcw d;
    
    public ahcx(final MessageLite a, final Object b, final MessageLite c, final ahcw d) {
        if (a == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
        if (d.c == ahgc.k && c == null) {
            throw new IllegalArgumentException("Null messageDefaultInstance");
        }
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final int a() {
        return this.d.b;
    }
    
    public final ahgc b() {
        return this.d.c;
    }
    
    final Object c(final Object o) {
        Object valueByNumber = o;
        if (this.d.a() == ahgd.h) {
            valueByNumber = this.d.a.findValueByNumber((int)o);
        }
        return valueByNumber;
    }
    
    final Object d(final Object o) {
        Object value = o;
        if (this.d.a() == ahgd.h) {
            value = ((ahdd)o).getNumber();
        }
        return value;
    }
    
    public final boolean e() {
        return this.d.d;
    }
}
