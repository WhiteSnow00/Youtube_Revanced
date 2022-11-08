import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apyd extends agzi implements ahax
{
    public static final apyd a;
    public static final agzg b;
    private static volatile ahbe k;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public agsr i;
    public String j;
    private int l;
    private byte m;
    
    static {
        final apyd a2 = new apyd();
        agzi.registerDefaultInstance(apyd.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)apyg.a, a2, (MessageLite)a2, null, 1000, ahcm.k, apyd.class);
    }
    
    private apyd() {
        this.m = 2;
        this.j = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe k;
                if ((k = apyd.k) == null) {
                    synchronized (apyd.class) {
                        if (apyd.k == null) {
                            apyd.k = (ahbe)new agzb((agzi)apyd.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return apyd.a;
            }
            case 4: {
                return new agza((agzi)apyd.a);
            }
            case 3: {
                return new apyd();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apyd.a, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\u0001\u0001\u100b\u0000\u0002\u100c\u0001\u0004\u100b\u0003\u0006\u100b\u0005\u0007\u100b\u0006\b\u1409\b\t\u100b\u0007\n\u1008\t", new Object[] { "l", "c", "d", apsc.r, "e", "f", "g", "i", "h", "j" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.m = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.m;
            }
        }
    }
}
