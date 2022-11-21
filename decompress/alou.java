import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alou extends ahcz implements aheo
{
    public static final alou a;
    private static volatile ahev m;
    public int b;
    public ahdp c;
    public String d;
    public boolean e;
    public long f;
    public String g;
    public int h;
    public int i;
    public alos j;
    public alor k;
    public int l;
    
    static {
        ahcz.registerDefaultInstance(alou.class, a = new alou());
    }
    
    private alou() {
        this.c = ahcz.emptyProtobufList();
        this.d = "";
        this.g = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev m;
                if ((m = alou.m) == null) {
                    synchronized (alou.class) {
                        if (alou.m == null) {
                            alou.m = (ahev)new ahcs((ahcz)alou.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return alou.a;
            }
            case 4: {
                return new ahcr((int[][][])null, (int[])null);
            }
            case 3: {
                return new alou();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alou.a, "\u0001\n\u0000\u0001\u0001\r\n\u0000\u0001\u0000\u0001\u001b\u0002\u1008\u0000\u0004\u1007\u0002\u0005\u1002\u0003\u0006\u1008\u0004\u0007\u1004\u0005\b\u1004\u0006\n\u1009\b\f\u1009\n\r\u100c\u000b", new Object[] { "b", "c", alot.class, "d", "e", "f", "g", "h", "i", "j", "k", "l", amwi.b });
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
