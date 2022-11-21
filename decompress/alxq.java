import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alxq extends ahcz implements aheo
{
    public static final alxq a;
    public static final ahcx b;
    private static volatile ahev f;
    public int c;
    public int d;
    public ahbt e;
    private ahjl g;
    private byte h;
    
    static {
        final alxq a2 = new alxq();
        ahcz.registerDefaultInstance(alxq.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 241780379, ahgc.k, alxq.class);
    }
    
    private alxq() {
        this.h = 2;
        this.e = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = alxq.f) == null) {
                    synchronized (alxq.class) {
                        if (alxq.f == null) {
                            alxq.f = (ahev)new ahcs((ahcz)alxq.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return alxq.a;
            }
            case 4: {
                return new ahcr((ahcz)alxq.a);
            }
            case 3: {
                return new alxq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alxq.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u100c\u0000\u0002\u100a\u0001\u0003\u1409\u0002", new Object[] { "c", "d", ajov.b, "e", "g" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
