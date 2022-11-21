import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akdx extends ahcz implements aheo
{
    public static final akdx a;
    private static volatile ahev n;
    public int b;
    public long c;
    public int d;
    public ahbt e;
    public long f;
    public ahbt g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public boolean m;
    
    static {
        ahcz.registerDefaultInstance(akdx.class, a = new akdx());
    }
    
    private akdx() {
        this.e = ahbt.b;
        this.g = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev n;
                if ((n = akdx.n) == null) {
                    synchronized (akdx.class) {
                        if (akdx.n == null) {
                            akdx.n = (ahev)new ahcs((ahcz)akdx.a);
                        }
                    }
                }
                return n;
            }
            case 5: {
                return akdx.a;
            }
            case 4: {
                return new ahcr((ahcz)akdx.a);
            }
            case 3: {
                return new akdx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akdx.a, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u100c\u0001\u0005\u100a\u0004\u0006\u1002\u0005\u0007\u100a\u0006\b\u1004\u0007\t\u1004\b\n\u1004\n\u000b\u1004\u000b\f\u1004\t\r\u1007\f", new Object[] { "b", "c", "d", akan.o, "e", "f", "g", "h", "i", "k", "l", "j", "m" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
