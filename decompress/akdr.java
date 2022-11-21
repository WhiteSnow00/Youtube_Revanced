import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akdr extends ahcz implements aheo
{
    public static final akdr a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(akdr.class, a = new akdr());
    }
    
    private akdr() {
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
                if ((d = akdr.d) == null) {
                    synchronized (akdr.class) {
                        if (akdr.d == null) {
                            akdr.d = (ahev)new ahcs((ahcz)akdr.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akdr.a;
            }
            case 4: {
                return new ahcr((ahcz)akdr.a);
            }
            case 3: {
                return new akdr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akdr.a, "\u0001\u0002\u0001\u0000\uf5b1\u2f1e\uf3fb\u30fa\u0002\u0000\u0000\u0002\uf5b1\u2f1e\u143c\u0000\uf3fb\u30fa\u143c\u0000", new Object[] { "c", "b", ajbz.class, akdp.class });
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
