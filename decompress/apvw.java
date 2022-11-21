import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apvw extends ahcz implements aheo
{
    public static final apvw a;
    private static volatile ahev d;
    public int b;
    public Object c;
    
    static {
        ahcz.registerDefaultInstance(apvw.class, a = new apvw());
    }
    
    private apvw() {
        this.b = 0;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = apvw.d) == null) {
                    synchronized (apvw.class) {
                        if (apvw.d == null) {
                            apvw.d = (ahev)new ahcs((ahcz)apvw.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apvw.a;
            }
            case 4: {
                return new ahcr((ahcz)apvw.a);
            }
            case 3: {
                return new apvw();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apvw.a, "\u0001\u0007\u0001\u0000\u0001\u0012\u0007\u0000\u0000\u0000\u0001\u103c\u0000\u0002\u103c\u0000\u0003\u103c\u0000\u0007\u103c\u0000\b\u103c\u0000\u000e\u103c\u0000\u0012\u103c\u0000", new Object[] { "c", "b", apwd.class, apvv.class, apwf.class, apwb.class, apwj.class, apwe.class, apvu.class });
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
