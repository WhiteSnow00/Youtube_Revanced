import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akpj extends ahcz implements aheo
{
    public static final akpj a;
    private static volatile ahev e;
    public int b;
    public aknj c;
    public aisc d;
    private ajxn f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(akpj.class, a = new akpj());
    }
    
    private akpj() {
        this.g = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = akpj.e) == null) {
                    synchronized (akpj.class) {
                        if (akpj.e == null) {
                            akpj.e = (ahev)new ahcs((ahcz)akpj.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akpj.a;
            }
            case 4: {
                return new ahcr((ahcz)akpj.a);
            }
            case 3: {
                return new akpj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akpj.a, "\u0001\u0003\u0000\u0001\u0001\u0309\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0309\u1409\u0002", new Object[] { "b", "c", "d", "f" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
