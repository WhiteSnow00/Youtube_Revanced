import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akdj extends ahcz implements aheo
{
    public static final akdj a;
    private static volatile ahev k;
    public int b;
    public akdk c;
    public boolean d;
    public akfj e;
    public ajws f;
    public aisc g;
    public aisc h;
    public ahkc i;
    public ahbt j;
    private ahjl l;
    private byte m;
    
    static {
        ahcz.registerDefaultInstance(akdj.class, a = new akdj());
    }
    
    private akdj() {
        this.m = 2;
        this.j = ahbt.b;
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
                if ((k = akdj.k) == null) {
                    synchronized (akdj.class) {
                        if (akdj.k == null) {
                            akdj.k = (ahev)new ahcs((ahcz)akdj.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return akdj.a;
            }
            case 4: {
                return new ahcr((ahcz)akdj.a);
            }
            case 3: {
                return new akdj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akdj.a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0005\u0001\u1009\u0000\u0002\u1007\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1009\u0006\b\u1409\u0007\t\u100a\b", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "l", "j" });
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
