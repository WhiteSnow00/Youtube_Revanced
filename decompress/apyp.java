import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apyp extends ahcz implements aheo
{
    public static final apyp a;
    private static volatile ahev e;
    public int b;
    public int c;
    public ahbt d;
    
    static {
        ahcz.registerDefaultInstance(apyp.class, a = new apyp());
    }
    
    private apyp() {
        this.d = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = apyp.e) == null) {
                    synchronized (apyp.class) {
                        if (apyp.e == null) {
                            apyp.e = (ahev)new ahcs((ahcz)apyp.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return apyp.a;
            }
            case 4: {
                return new ahcr((ahcz)apyp.a);
            }
            case 3: {
                return new apyp();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apyp.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100a\u0001", new Object[] { "b", "c", apvm.j, "d" });
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
