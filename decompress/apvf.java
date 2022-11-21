import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apvf extends ahcz implements aheo
{
    public static final apvf a;
    private static volatile ahev f;
    public int b;
    public String c;
    public int d;
    public String e;
    private aisc g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(apvf.class, a = new apvf());
    }
    
    private apvf() {
        this.h = 2;
        this.c = "";
        this.e = "";
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
                final ahev f;
                if ((f = apvf.f) == null) {
                    synchronized (apvf.class) {
                        if (apvf.f == null) {
                            apvf.f = (ahev)new ahcs((ahcz)apvf.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apvf.a;
            }
            case 4: {
                return new ahcr((ahcz)apvf.a);
            }
            case 3: {
                return new apvf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apvf.a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u100b\u0001\u0004\u1008\u0002\u0006\u1409\u0004", new Object[] { "b", "c", "d", "e", "g" });
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
