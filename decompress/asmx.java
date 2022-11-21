// 
// Decompiled by Procyon v0.6.0
// 

final class asmx implements asmn
{
    final Class a;
    
    public asmx(final Class a) {
        this.a = a;
    }
    
    @Override
    public final Object a(final Object o) {
        return this.a.cast(o);
    }
}
