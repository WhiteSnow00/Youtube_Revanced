import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aopj extends ahcz implements aheo
{
    public static final aopj a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aopj.class, a = new aopj());
    }
    
    private aopj() {
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
                if ((d = aopj.d) == null) {
                    synchronized (aopj.class) {
                        if (aopj.d == null) {
                            aopj.d = (ahev)new ahcs((ahcz)aopj.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aopj.a;
            }
            case 4: {
                return new ahcr((ahcz)aopj.a);
            }
            case 3: {
                return new aopj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aopj.a, "\u0001\u0002\u0001\u0000\uf5b1\u2f1e\uf3fb\u30fa\u0002\u0000\u0000\u0002\uf5b1\u2f1e\u143c\u0000\uf3fb\u30fa\u143c\u0000", new Object[] { "c", "b", ajbz.class, akdp.class });
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
