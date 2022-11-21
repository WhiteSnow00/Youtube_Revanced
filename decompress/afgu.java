import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class afgu extends affy
{
    public final afgm a;
    
    public afgu(final afgm a) {
        this.a = a;
    }
    
    @Override
    public final boolean contains(final Object o) {
        return o != null && agpx.ae((Iterator)this.k(), o);
    }
    
    @Override
    public final afgh g() {
        return new afgs(this.a.r().g());
    }
    
    @Override
    public final /* bridge */ Iterator iterator() {
        return (Iterator)this.k();
    }
    
    @Override
    public final aflu k() {
        return new afgr(this);
    }
    
    @Override
    public final boolean l() {
        throw null;
    }
    
    @Override
    public final int size() {
        return this.a.size();
    }
    
    @Override
    Object writeReplace() {
        return new afgt(this.a);
    }
}
