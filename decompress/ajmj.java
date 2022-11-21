import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajmj extends ahcz implements aheo
{
    public static final ajmj a;
    private static volatile ahev e;
    public int b;
    public ahdp c;
    public int d;
    
    static {
        ahcz.registerDefaultInstance(ajmj.class, a = new ajmj());
    }
    
    private ajmj() {
        this.c = ahcz.emptyProtobufList();
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
                if ((e = ajmj.e) == null) {
                    synchronized (ajmj.class) {
                        if (ajmj.e == null) {
                            ajmj.e = (ahev)new ahcs((ahcz)ajmj.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajmj.a;
            }
            case 4: {
                return new ahcr((int[])null, (char[][])null);
            }
            case 3: {
                return new ajmj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajmj.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u1004\u0000", new Object[] { "b", "c", ajmi.class, "d" });
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
