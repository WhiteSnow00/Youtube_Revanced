import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apke extends agzi implements ahax
{
    public static final apke a;
    private static volatile ahbe l;
    public int b;
    public String c;
    public String d;
    public String e;
    public String f;
    public long g;
    public long h;
    public int i;
    public aorm j;
    public int k;
    private byte m;
    
    static {
        agzi.registerDefaultInstance(apke.class, a = new apke());
    }
    
    private apke() {
        this.m = 2;
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
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
                final ahbe l;
                if ((l = apke.l) == null) {
                    synchronized (apke.class) {
                        if (apke.l == null) {
                            apke.l = (ahbe)new agzb((agzi)apke.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return apke.a;
            }
            case 4: {
                return new agza((agzi)apke.a);
            }
            case 3: {
                return new apke();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apke.a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1003\u0004\u0006\u1003\u0005\u0007\u1004\u0006\b\u1409\u0007\t\u1004\b", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "j", "k" });
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
