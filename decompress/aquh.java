import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aquh extends ahcz implements aheo
{
    public static final aquh a;
    private static volatile ahev e;
    public int b;
    public int c;
    public int d;
    
    static {
        ahcz.registerDefaultInstance(aquh.class, a = new aquh());
    }
    
    private aquh() {
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
                if ((e = aquh.e) == null) {
                    synchronized (aquh.class) {
                        if (aquh.e == null) {
                            aquh.e = (ahev)new ahcs((ahcz)aquh.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aquh.a;
            }
            case 4: {
                return new ahcr((ahcz)aquh.a);
            }
            case 3: {
                return new aquh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aquh.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1004\u0001", new Object[] { "b", "c", amgu.a(), "d" });
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
