import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akdp extends ahcz implements aheo
{
    public static final akdp a;
    private static volatile ahev k;
    public int b;
    public String c;
    public akdm d;
    public akdn e;
    public long f;
    public akdo g;
    public akdq h;
    public akdl i;
    public ahdp j;
    private ahjl l;
    private byte m;
    
    static {
        ahcz.registerDefaultInstance(akdp.class, a = new akdp());
    }
    
    private akdp() {
        this.m = 2;
        this.c = "";
        this.j = ahcz.emptyProtobufList();
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte m = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev k;
                if ((k = akdp.k) == null) {
                    synchronized (akdp.class) {
                        if (akdp.k == null) {
                            akdp.k = (ahev)new ahcs((ahcz)akdp.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return akdp.a;
            }
            case 4: {
                return new ahcr((ahcz)akdp.a);
            }
            case 3: {
                return new akdp();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akdp.a, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0001\u0003\u0001\u1008\u0000\u0002\u1409\u0001\u0003\u1009\u0002\u0004\u1002\u0003\u0005\u1009\u0004\u0006\u1009\u0005\u0007\u041b\b\u1009\u0006\n\u1409\b", new Object[] { "b", "c", "d", "e", "f", "g", "h", "j", aisc.class, "i", "l" });
            }
            case 1: {
                if (o == null) {
                    m = 0;
                }
                this.m = m;
                return null;
            }
            case 0: {
                return this.m;
            }
        }
    }
}
