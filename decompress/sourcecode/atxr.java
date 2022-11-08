import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atxr extends agzi implements ahax
{
    public static final atxr a;
    private static volatile ahbe l;
    public int b;
    public boolean c;
    public atxn d;
    public String e;
    public String f;
    public int g;
    public String h;
    public afpk i;
    public ahex j;
    public atxt k;
    private byte m;
    
    static {
        agzi.registerDefaultInstance(atxr.class, a = new atxr());
    }
    
    private atxr() {
        this.m = 2;
        this.e = "";
        this.f = "";
        this.h = "";
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
                if ((l = atxr.l) == null) {
                    synchronized (atxr.class) {
                        if (atxr.l == null) {
                            atxr.l = (ahbe)new agzb((agzi)atxr.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return atxr.a;
            }
            case 4: {
                return new agza((agzi)atxr.a);
            }
            case 3: {
                return new atxr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)atxr.a, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0000\u0001\u0001\u1007\u0000\u0002\u1009\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u100c\u0004\u0007\u1008\u0007\t\u1409\b\n\u1009\t\u000b\u1009\n", new Object[] { "b", "c", "d", "e", "f", "g", arbt.q, "h", "i", "j", "k" });
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
