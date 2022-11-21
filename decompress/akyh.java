import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akyh extends ahcz implements aheo
{
    public static final akyh a;
    private static volatile ahev i;
    public int b;
    public String c;
    public int d;
    public int e;
    public ahdp f;
    public int g;
    public int h;
    
    static {
        ahcz.registerDefaultInstance(akyh.class, a = new akyh());
    }
    
    private akyh() {
        this.c = "";
        this.f = ahcz.emptyProtobufList();
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
                if ((i = akyh.i) == null) {
                    synchronized (akyh.class) {
                        if (akyh.i == null) {
                            akyh.i = (ahev)new ahcs((ahcz)akyh.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return akyh.a;
            }
            case 4: {
                return new ahcr((float[])null, (float[])null);
            }
            case 3: {
                return new akyh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akyh.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u100b\u0001\u0003\u100b\u0002\u0004\u001b\u0005\u100b\u0003\u0006\u100b\u0004", new Object[] { "b", "c", "d", "e", "f", akyk.class, "g", "h" });
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
