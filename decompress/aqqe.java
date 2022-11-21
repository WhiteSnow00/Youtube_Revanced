import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqqe extends ahcz implements aheo
{
    public static final aqqe a;
    public static final ahcx b;
    private static volatile ahev e;
    public int c;
    public akmg d;
    private byte f;
    
    static {
        final aqqe a2 = new aqqe();
        ahcz.registerDefaultInstance(aqqe.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 363503224, ahgc.k, aqqe.class);
    }
    
    private aqqe() {
        this.f = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = aqqe.e) == null) {
                    synchronized (aqqe.class) {
                        if (aqqe.e == null) {
                            aqqe.e = (ahev)new ahcs((ahcz)aqqe.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqqe.a;
            }
            case 4: {
                return new ahcr((ahcz)aqqe.a);
            }
            case 3: {
                return new aqqe();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqqe.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
