// 
// Decompiled by Procyon v0.6.0
// 

public final class abqw extends dpp
{
    public static final abqw b;
    
    static {
        b = new abqw();
    }
    
    @Override
    public final dpu b(final String s, final byte[] array) {
        int n = 0;
        Label_0153: {
            switch (s.hashCode()) {
                case 3568419: {
                    if (s.equals("traf")) {
                        n = 4;
                        break Label_0153;
                    }
                    break;
                }
                case 3556994: {
                    if (s.equals("tfdt")) {
                        n = 5;
                        break Label_0153;
                    }
                    break;
                }
                case 3363941: {
                    if (s.equals("mvhd")) {
                        n = 2;
                        break Label_0153;
                    }
                    break;
                }
                case 3357449: {
                    if (s.equals("moov")) {
                        n = 1;
                        break Label_0153;
                    }
                    break;
                }
                case 3357433: {
                    if (s.equals("moof")) {
                        n = 3;
                        break Label_0153;
                    }
                    break;
                }
                case 3346442: {
                    if (s.equals("mdat")) {
                        n = 0;
                        break Label_0153;
                    }
                    break;
                }
            }
            n = -1;
        }
        if (n == 0) {
            return (dpu)new drt();
        }
        if (n == 1) {
            return (dpu)new dqm();
        }
        if (n == 2) {
            return (dpu)new dqn();
        }
        if (n == 3) {
            return (dpu)new drl();
        }
        if (n == 4) {
            return (dpu)new drp();
        }
        if (n != 5) {
            return (dpu)new drh(s);
        }
        return (dpu)new dro();
    }
}
