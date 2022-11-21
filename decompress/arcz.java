import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arcz extends ahcz implements aheo
{
    public static final arcz a;
    private static volatile ahev e;
    public int b;
    public String c;
    public ahdp d;
    
    static {
        ahcz.registerDefaultInstance(arcz.class, a = new arcz());
    }
    
    private arcz() {
        this.c = "";
        this.d = ahcz.emptyProtobufList();
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
                if ((e = arcz.e) == null) {
                    synchronized (arcz.class) {
                        if (arcz.e == null) {
                            arcz.e = (ahev)new ahcs((ahcz)arcz.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return arcz.a;
            }
            case 4: {
                return new ahcr((byte[])null, (char[][][])null);
            }
            case 3: {
                return new arcz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)arcz.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u001a", new Object[] { "b", "c", "d" });
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
