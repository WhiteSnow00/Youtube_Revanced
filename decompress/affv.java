import java.util.Collection;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import j$.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class affv extends afgm implements j$.util.Map, afdu
{
    public static afft b() {
        return new afft();
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }
    
    public final /* bridge */ afdu a() {
        throw null;
    }
    
    public abstract affv c();
    
    @Override
    public final /* bridge */ affy d() {
        throw new AssertionError((Object)"should never be called");
    }
    
    @Override
    public final /* bridge */ affy e() {
        return this.f();
    }
    
    public final afhk f() {
        return this.c().s();
    }
    
    public final /* bridge */ Collection values() {
        return this.f();
    }
    
    @Override
    Object writeReplace() {
        return new affu(this);
    }
}
