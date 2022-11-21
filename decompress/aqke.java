import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqke extends ahcz implements aheo
{
    public static final aqke a;
    private static volatile ahev f;
    public int b;
    public ahbt c;
    public SenderStateOuterClass$SenderState d;
    public aqkd e;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(aqke.class, a = new aqke());
    }
    
    private aqke() {
        this.g = 2;
        this.c = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = aqke.f) == null) {
                    synchronized (aqke.class) {
                        if (aqke.f == null) {
                            aqke.f = (ahev)new ahcs((ahcz)aqke.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqke.a;
            }
            case 4: {
                return new ahcr((ahcz)aqke.a);
            }
            case 3: {
                return new aqke();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqke.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001\u100a\u0000\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "b", "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
