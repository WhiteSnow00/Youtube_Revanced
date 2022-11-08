import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aguc extends agzi implements ahax
{
    public static final aguc a;
    private static volatile ahbe m;
    public int b;
    public int c;
    public String d;
    public int e;
    public agzy f;
    public int g;
    public agsv h;
    public agsu i;
    public agts j;
    public int k;
    public int l;
    
    static {
        agzi.registerDefaultInstance(aguc.class, a = new aguc());
    }
    
    private aguc() {
        this.d = "";
        this.f = agzi.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe m;
                if ((m = aguc.m) == null) {
                    synchronized (aguc.class) {
                        if (aguc.m == null) {
                            aguc.m = (ahbe)new agzb((agzi)aguc.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return aguc.a;
            }
            case 4: {
                return new agza((byte[][][])null, (byte[])null);
            }
            case 3: {
                return new aguc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aguc.a, "\u0001\n\u0000\u0001\u0001\"\n\u0000\u0001\u0000\u0001\u100c\u0000\u0002\u1008\u0001\u0005\u1009\u0007\u0006\u1009\b\t\u100c\u0002\n\u100c\f\f\u001b\r\u100c\r\u000e\u1009\u000b\"\u100c\u0006", new Object[] { "b", "c", agua.b(), "d", "h", "i", "e", agte.l, "k", agte.m, "f", agub.class, "l", agtn.b(), "j", "g", afon.s });
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
