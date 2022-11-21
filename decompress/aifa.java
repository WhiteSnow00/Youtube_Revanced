import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aifa extends ahcz implements aheo
{
    public static final aifa a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aifa.class, a = new aifa());
    }
    
    private aifa() {
        this.b = 0;
        this.e = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = aifa.d) == null) {
                    synchronized (aifa.class) {
                        if (aifa.d == null) {
                            aifa.d = (ahev)new ahcs((ahcz)aifa.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aifa.a;
            }
            case 4: {
                return new ahcr((ahcz)aifa.a);
            }
            case 3: {
                return new aifa();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aifa.a, "\u0001\u0002\u0001\u0000\uf5b1\u2f1e\uf3fb\u30fa\u0002\u0000\u0000\u0002\uf5b1\u2f1e\u143c\u0000\uf3fb\u30fa\u143c\u0000", new Object[] { "c", "b", ajbz.class, akdp.class });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
