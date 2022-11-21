import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class aejz extends ahcz implements aheo
{
    public static final aejz a;
    private static volatile ahev d;
    public int b;
    public aeka c;
    
    static {
        ahcz.registerDefaultInstance(aejz.class, a = new aejz());
    }
    
    private aejz() {
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
                if ((d = aejz.d) == null) {
                    synchronized (aejz.class) {
                        if (aejz.d == null) {
                            aejz.d = (ahev)new ahcs((ahcz)aejz.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aejz.a;
            }
            case 4: {
                return new ahcr((ahcz)aejz.a);
            }
            case 3: {
                return new aejz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aejz.a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\t", new Object[] { "b", "c" });
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
