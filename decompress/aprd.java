import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aprd extends ahcz implements aheo
{
    public static final aprd a;
    private static volatile ahev d;
    public ahdp b;
    public ahdp c;
    
    static {
        ahcz.registerDefaultInstance(aprd.class, a = new aprd());
    }
    
    private aprd() {
        this.b = ahcz.emptyProtobufList();
        this.c = ahcz.emptyProtobufList();
    }
    
    public final void a() {
        final ahdp b = this.b;
        if (!b.c()) {
            this.b = ahcz.mutableCopy(b);
        }
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
                if ((d = aprd.d) == null) {
                    synchronized (aprd.class) {
                        if (aprd.d == null) {
                            aprd.d = (ahev)new ahcs((ahcz)aprd.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aprd.a;
            }
            case 4: {
                return new ahcr((boolean[])null, (char[])null);
            }
            case 3: {
                return new aprd();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aprd.a, "\u0001\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0002\u0000\u0001\u001b\u0003\u001b", new Object[] { "b", apra.class, "c", aprc.class });
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
