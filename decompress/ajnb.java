import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajnb extends ahcz implements aheo
{
    public static final ajnb a;
    private static volatile ahev h;
    public int b;
    public ajnc c;
    public int d;
    public ajnd e;
    public ahdp f;
    public ajmw g;
    
    static {
        ahcz.registerDefaultInstance(ajnb.class, a = new ajnb());
    }
    
    private ajnb() {
        this.d = 1;
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
                final ahev h;
                if ((h = ajnb.h) == null) {
                    synchronized (ajnb.class) {
                        if (ajnb.h == null) {
                            ajnb.h = (ahev)new ahcs((ahcz)ajnb.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return ajnb.a;
            }
            case 4: {
                return new ahcr((float[])null, (byte[][])null);
            }
            case 3: {
                return new ajnb();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajnb.a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001\u1009\u0000\u0002\u100c\u0001\u0004\u1009\u0003\u0005\u001b\u0006\u1009\u0004", new Object[] { "b", "c", "d", ajgj.t, "e", "f", ajna.class, "g" });
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
