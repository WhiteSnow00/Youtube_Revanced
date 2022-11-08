import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apnf extends agzi implements ahax
{
    public static final apnf a;
    private static volatile ahbe l;
    public int b;
    public String c;
    public ajsq d;
    public int e;
    public ajsq f;
    public int g;
    public ajsq h;
    public String i;
    public ajsq j;
    public int k;
    private byte m;
    
    static {
        agzi.registerDefaultInstance((Class)apnf.class, (agzi)(a = new apnf()));
    }
    
    private apnf() {
        this.m = 2;
        this.c = "";
        this.i = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe l;
                if ((l = apnf.l) == null) {
                    synchronized (apnf.class) {
                        if (apnf.l == null) {
                            apnf.l = (ahbe)new agzb((agzi)apnf.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return apnf.a;
            }
            case 4: {
                return new agza((agzi)apnf.a);
            }
            case 3: {
                return new apnf();
            }
            case 2: {
                return newMessageInfo((MessageLite)apnf.a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0004\u0001\u1008\u0000\u0002\u1409\u0001\u0003\u1409\u0003\u0004\u1409\u0005\u0005\u1008\u0006\u0006\u1409\u0007\u0007\u100b\u0002\b\u100b\u0004\t\u100b\b", new Object[] { "b", "c", "d", "f", "h", "i", "j", "e", "g", "k" });
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
