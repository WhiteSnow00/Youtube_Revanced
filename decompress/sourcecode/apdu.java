import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apdu extends agzi implements ahax
{
    public static final apdu a;
    public static final agzg b;
    private static volatile ahbe d;
    public akzu c;
    private int e;
    private byte f;
    
    static {
        final apdu a2 = new apdu();
        agzi.registerDefaultInstance(apdu.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 359752495, ahcm.k, apdu.class);
    }
    
    private apdu() {
        this.f = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = apdu.d) == null) {
                    synchronized (apdu.class) {
                        if (apdu.d == null) {
                            apdu.d = (ahbe)new agzb((agzi)apdu.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apdu.a;
            }
            case 4: {
                return new agza((agzi)apdu.a);
            }
            case 3: {
                return new apdu();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apdu.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "e", "c" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
