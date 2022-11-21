import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aexo extends ahcz implements aheo
{
    public static final aexo a;
    private static volatile ahev e;
    public aexg b;
    public String c;
    public boolean d;
    
    static {
        ahcz.registerDefaultInstance(aexo.class, a = new aexo());
    }
    
    private aexo() {
        final ahbt b = ahbt.b;
        this.c = "";
        ahcz.emptyProtobufList();
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
                if ((e = aexo.e) == null) {
                    synchronized (aexo.class) {
                        if (aexo.e == null) {
                            aexo.e = (ahev)new ahcs((ahcz)aexo.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aexo.a;
            }
            case 4: {
                return new ahcr((ahcz)aexo.a);
            }
            case 3: {
                return new aexo();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aexo.a, "\u0000\u0003\u0000\u0000\u0002\b\u0003\u0000\u0000\u0000\u0002\u0208\u0003\t\b\u0007", new Object[] { "c", "b", "d" });
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
