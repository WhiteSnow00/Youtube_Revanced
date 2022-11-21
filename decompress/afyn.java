import java.security.GeneralSecurityException;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

final class afyn implements afym
{
    private final agcc a;
    private final Class b;
    
    public afyn(final agcc a, final Class b) {
        if (!a.j().contains(b) && !Void.class.equals(b)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", a.toString(), b.getName()));
        }
        this.a = a;
        this.b = b;
    }
    
    private final Object g(final MessageLite messageLite) {
        if (!Void.class.equals(this.b)) {
            this.a.e(messageLite);
            return this.a.i(messageLite, this.b);
        }
        throw new GeneralSecurityException("Cannot create a primitive for Void");
    }
    
    private final agpb h() {
        return new agpb(this.a.a());
    }
    
    @Override
    public final MessageLite a(final ahbt ahbt) {
        try {
            return this.h().F(ahbt);
        }
        catch (final ahds ahds) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(String.valueOf(this.a.a().a.getName())), (Throwable)ahds);
        }
    }
    
    @Override
    public final Class b() {
        return this.b;
    }
    
    @Override
    public final Object c(final ahbt ahbt) {
        try {
            return this.g(this.a.c(ahbt));
        }
        catch (final ahds ahds) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(String.valueOf(this.a.b.getName())), (Throwable)ahds);
        }
    }
    
    @Override
    public final Object d(final MessageLite messageLite) {
        final String value = String.valueOf(this.a.b.getName());
        if (this.a.b.isInstance(messageLite)) {
            return this.g(messageLite);
        }
        throw new GeneralSecurityException("Expected proto of type ".concat(value));
    }
    
    @Override
    public final String e() {
        return this.a.d();
    }
    
    @Override
    public final void f(final ahbt ahbt) {
        try {
            final MessageLite f = this.h().F(ahbt);
            final ahcr builder = ((ahcz)agfc.a).createBuilder();
            final String e = this.e();
            builder.copyOnWrite();
            ((agfc)builder.instance).b = e;
            final ahbt byteString = f.toByteString();
            builder.copyOnWrite();
            final agfc agfc = (agfc)builder.instance;
            byteString.getClass();
            agfc.c = byteString;
            final agfb b = this.a.b();
            builder.copyOnWrite();
            ((agfc)builder.instance).d = b.getNumber();
            final agfc agfc2 = (agfc)builder.build();
        }
        catch (final ahds ahds) {
            throw new GeneralSecurityException("Unexpected proto", (Throwable)ahds);
        }
    }
}
