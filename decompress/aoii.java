import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoii extends ahcz implements aheo
{
    public static final aoii a;
    public static final ahcx b;
    private static volatile ahev g;
    public int c;
    public aqiq d;
    public akdp e;
    public String f;
    private byte h;
    
    static {
        final aoii a2 = new aoii();
        ahcz.registerDefaultInstance(aoii.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 427222820, ahgc.k, aoii.class);
    }
    
    private aoii() {
        this.h = 2;
        this.f = "";
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
                final ahev g;
                if ((g = aoii.g) == null) {
                    synchronized (aoii.class) {
                        if (aoii.g == null) {
                            aoii.g = (ahev)new ahcs((ahcz)aoii.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aoii.a;
            }
            case 4: {
                return new ahcr((ahcz)aoii.a);
            }
            case 3: {
                return new aoii();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aoii.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1008\u0002", new Object[] { "c", "d", "e", "f" });
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
