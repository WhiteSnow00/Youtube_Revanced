import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import java.security.GeneralSecurityException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afzi extends afyj
{
    public afzi() {
        super((Class)agbb.class, new afyp[] { new afzg(afve.class) });
    }
    
    public static void g(final agbd agbd) {
        final int c = agbd.c;
        if (c >= 10) {
            int z;
            if ((z = aesy.Z(agbd.b)) == 0) {
                z = 1;
            }
            z -= 2;
            if (z != 1) {
                if (z != 2) {
                    if (z != 3) {
                        if (z != 4) {
                            if (z != 5) {
                                throw new GeneralSecurityException("unknown hash type");
                            }
                            if (c > 28) {
                                throw new GeneralSecurityException("tag size too big");
                            }
                        }
                        else if (c > 64) {
                            throw new GeneralSecurityException("tag size too big");
                        }
                    }
                    else if (c > 32) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                }
                else if (c > 48) {
                    throw new GeneralSecurityException("tag size too big");
                }
            }
            else if (c > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        throw new GeneralSecurityException("tag size too small");
    }
    
    public static final void h(final agbb agbb) {
        agep.d(agbb.b);
        if (agbb.d.d() >= 16) {
            agbd agbd;
            if ((agbd = agbb.c) == null) {
                agbd = agbd.a;
            }
            g(agbd);
            return;
        }
        throw new GeneralSecurityException("key too short");
    }
    
    public static ardu k(final int c, final int c2, final int n, final int n2) {
        final agza builder = ((agzi)agbc.a).createBuilder();
        final agza builder2 = ((agzi)agbd.a).createBuilder();
        builder2.copyOnWrite();
        ((agbd)builder2.instance).b = aesy.Y(n);
        builder2.copyOnWrite();
        ((agbd)builder2.instance).c = c2;
        final agbd b = (agbd)builder2.build();
        builder.copyOnWrite();
        final agbc agbc = (agbc)builder.instance;
        b.getClass();
        agbc.b = b;
        builder.copyOnWrite();
        ((agbc)builder.instance).c = c;
        return new ardu(builder.build(), n2);
    }
    
    public final afyi a() {
        return new afzh(agbc.class);
    }
    
    public final agbi b() {
        return agbi.b;
    }
    
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }
    
    public final int f() {
        return 2;
    }
}
