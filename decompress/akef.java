import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akef extends ahcz implements aheo
{
    public static final akef a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(akef.class, a = new akef());
    }
    
    private akef() {
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
                if ((d = akef.d) == null) {
                    synchronized (akef.class) {
                        if (akef.d == null) {
                            akef.d = (ahev)new ahcs((ahcz)akef.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akef.a;
            }
            case 4: {
                return new ahcr((ahcz)akef.a);
            }
            case 3: {
                return new akef();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akef.a, "\u0001\u0001\u0001\u0000\uf3fb\u30fa\uf3fb\u30fa\u0001\u0000\u0000\u0001\uf3fb\u30fa\u143c\u0000", new Object[] { "c", "b", akdp.class });
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
