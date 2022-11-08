import java.security.GeneralSecurityException;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

final class afuu implements afut
{
    private final afyj a;
    private final Class b;
    
    public afuu(final afyj a, final Class b) {
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
    
    private final adcr h() {
        return new adcr(this.a.a());
    }
    
    @Override
    public final MessageLite a(final agyc agyc) {
        try {
            return this.h().J(agyc);
        }
        catch (final ahab ahab) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(String.valueOf(this.a.a().a.getName())), (Throwable)ahab);
        }
    }
    
    @Override
    public final Class b() {
        return this.b;
    }
    
    @Override
    public final Object c(final agyc agyc) {
        try {
            return this.g(this.a.c(agyc));
        }
        catch (final ahab ahab) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(String.valueOf(this.a.b.getName())), (Throwable)ahab);
        }
    }
    
    @Override
    public final Object d(final MessageLite messageLite) {
        final String concat = "Expected proto of type ".concat(String.valueOf(this.a.b.getName()));
        if (this.a.b.isInstance(messageLite)) {
            return this.g(messageLite);
        }
        throw new GeneralSecurityException(concat);
    }
    
    @Override
    public final String e() {
        return this.a.d();
    }
    
    @Override
    public final void f(final agyc agyc) {
        try {
            final MessageLite j = this.h().J(agyc);
            final agza builder = agbj.a.createBuilder();
            final String e = this.e();
            builder.copyOnWrite();
            ((agbj)builder.instance).b = e;
            final agyc byteString = j.toByteString();
            builder.copyOnWrite();
            final agbj agbj = (agbj)builder.instance;
            byteString.getClass();
            agbj.c = byteString;
            final agbi b = this.a.b();
            builder.copyOnWrite();
            ((agbj)builder.instance).d = b.getNumber();
            final agbj agbj2 = (agbj)builder.build();
        }
        catch (final ahab ahab) {
            throw new GeneralSecurityException("Unexpected proto", (Throwable)ahab);
        }
    }
}
