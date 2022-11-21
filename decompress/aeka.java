import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class aeka extends ahcz implements aheo
{
    public static final aeka a;
    private static volatile ahev e;
    public ahdp b;
    public ahdh c;
    public boolean d;
    
    static {
        ahcz.registerDefaultInstance(aeka.class, a = new aeka());
    }
    
    private aeka() {
        this.b = ahcz.emptyProtobufList();
        this.c = ahcz.emptyIntList();
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
                if ((e = aeka.e) == null) {
                    synchronized (aeka.class) {
                        if (aeka.e == null) {
                            aeka.e = (ahev)new ahcs((ahcz)aeka.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aeka.a;
            }
            case 4: {
                return new ahcr((ahcz)aeka.a);
            }
            case 3: {
                return new aeka();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aeka.a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002'\u0003\u0007", new Object[] { "b", aejz.class, "c", "d" });
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
