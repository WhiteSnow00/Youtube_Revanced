import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akxj extends ahcz implements aheo
{
    public static final akxj a;
    private static volatile ahev i;
    public int b;
    public String c;
    public long d;
    public ahdp e;
    public boolean f;
    public long g;
    public long h;
    
    static {
        ahcz.registerDefaultInstance(akxj.class, a = new akxj());
    }
    
    private akxj() {
        this.c = "";
        this.e = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev i;
                if ((i = akxj.i) == null) {
                    synchronized (akxj.class) {
                        if (akxj.i == null) {
                            akxj.i = (ahev)new ahcs((ahcz)akxj.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return akxj.a;
            }
            case 4: {
                return new ahcr((byte[][][])null, (short[])null);
            }
            case 3: {
                return new akxj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akxj.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u1002\u0001\u0003\u001a\u0004\u1007\u0002\u0005\u1002\u0003\u0006\u1002\u0004", new Object[] { "b", "c", "d", "e", "f", "g", "h" });
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
