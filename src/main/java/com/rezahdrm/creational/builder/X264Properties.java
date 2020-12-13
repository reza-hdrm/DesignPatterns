package com.rezahdrm.creational.builder;

public class X264Properties {
    private int keyInt;
    private int minKeyInt;
    private int sceneCut;
    private int bFrames;
    private int bAdapt;
    private int qp;
    private int bitrate;
    private boolean bFrameBias;
    private int crf;
    private int qpStep;
    private int pbRatio;
    private int chromaOffset;
    private float rateTol;
    private byte pass;
    private boolean stats;
    private int direct;
    private int meRange;
    private boolean weightB;
    private boolean noFastPSkip;

    public int getKeyInt() {
        return keyInt;
    }

    public void setKeyInt(int keyInt) {
        this.keyInt = keyInt;
    }

    public int getMinKeyInt() {
        return minKeyInt;
    }

    public void setMinKeyInt(int minKeyInt) {
        this.minKeyInt = minKeyInt;
    }

    public int getSceneCut() {
        return sceneCut;
    }

    public void setSceneCut(int sceneCut) {
        this.sceneCut = sceneCut;
    }

    public int getbFrames() {
        return bFrames;
    }

    public void setbFrames(int bFrames) {
        this.bFrames = bFrames;
    }

    public int getbAdapt() {
        return bAdapt;
    }

    public void setbAdapt(int bAdapt) {
        this.bAdapt = bAdapt;
    }

    public int getQp() {
        return qp;
    }

    public void setQp(int qp) {
        this.qp = qp;
    }

    public int getBitrate() {
        return bitrate;
    }

    public void setBitrate(int bitrate) {
        this.bitrate = bitrate;
    }

    public boolean isbFrameBias() {
        return bFrameBias;
    }

    public void setbFrameBias(boolean bFrameBias) {
        this.bFrameBias = bFrameBias;
    }

    public int getCrf() {
        return crf;
    }

    public void setCrf(int crf) {
        this.crf = crf;
    }

    public int getQpStep() {
        return qpStep;
    }

    public void setQpStep(int qpStep) {
        this.qpStep = qpStep;
    }

    public int getPbRatio() {
        return pbRatio;
    }

    public void setPbRatio(int pbRatio) {
        this.pbRatio = pbRatio;
    }

    public int getChromaOffset() {
        return chromaOffset;
    }

    public void setChromaOffset(int chromaOffset) {
        this.chromaOffset = chromaOffset;
    }

    public float getRateTol() {
        return rateTol;
    }

    public void setRateTol(float rateTol) {
        this.rateTol = rateTol;
    }

    public byte getPass() {
        return pass;
    }

    public void setPass(byte pass) {
        this.pass = pass;
    }

    public boolean isStats() {
        return stats;
    }

    public void setStats(boolean stats) {
        this.stats = stats;
    }

    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }

    public int getMeRange() {
        return meRange;
    }

    public void setMeRange(int meRange) {
        this.meRange = meRange;
    }

    public boolean isWeightB() {
        return weightB;
    }

    public void setWeightB(boolean weightB) {
        this.weightB = weightB;
    }

    public boolean isNoFastPSkip() {
        return noFastPSkip;
    }

    public void setNoFastPSkip(boolean noFastPSkip) {
        this.noFastPSkip = noFastPSkip;
    }

    public static class Builder {
        private X264Properties x264Properties;
        private int keyInt;
        private int minKeyInt;
        private int sceneCut;
        private int bFrames;
        private int bAdapt;
        private int qp;
        private int bitrate;
        private boolean bFrameBias;
        private int crf;
        private int qpStep;
        private int pbRatio;
        private int chromaOffset;
        private float rateTol;
        private byte pass;
        private boolean stats;
        private int direct;
        private int meRange;
        private boolean weightB;
        private boolean noFastPSkip;

        public Builder keyInt(int keyInt) {
            this.keyInt = keyInt;
            return this;
        }

        public Builder minKeyInt(int minKeyInt) {
            this.minKeyInt = minKeyInt;
            return this;
        }

        public Builder sceneCut(int sceneCut) {
            this.sceneCut = sceneCut;
            return this;
        }

        public Builder bFrames(int bFrames) {
            this.bFrames = bFrames;
            return this;
        }

        public Builder bAdapt(int bAdapt) {
            this.bAdapt = bAdapt;
            return this;
        }

        public Builder qp(int qp) {
            this.qp = qp;
            return this;
        }

        public Builder bitrate(int bitrate) {
            this.bitrate = bitrate;
            return this;
        }

        public Builder bFrameBias(boolean bFrameBias) {
            this.bFrameBias = bFrameBias;
            return this;
        }

        public Builder crf(int crf) {
            this.crf = crf;
            return this;
        }

        public Builder qpStep(int qpStep) {
            this.qpStep = qpStep;
            return this;
        }

        public Builder pbRatio(int pbRatio) {
            this.pbRatio = pbRatio;
            return this;
        }

        public Builder chromaOffset(int chromaOff) {
            this.chromaOffset = chromaOff;
            return this;
        }

        public Builder rateTol(float rateTol) {
            this.rateTol = rateTol;
            return this;
        }

        public Builder pass(byte pass) {
            this.pass = pass;
            return this;
        }

        public Builder stats(boolean stats) {
            this.stats = stats;
            return this;
        }

        public Builder direct(int direct) {
            this.direct = direct;
            return this;
        }

        public Builder meRange(int meRange) {
            this.meRange = meRange;
            return this;
        }

        public Builder weightB(boolean weightB) {
            this.weightB = weightB;
            return this;
        }

        public Builder noFastPSkip(boolean noFastPSkip) {
            this.noFastPSkip = noFastPSkip;
            return this;
        }

        public X264Properties build() {
            x264Properties = new X264Properties();
            x264Properties.setKeyInt(this.keyInt);
            x264Properties.setMinKeyInt(this.minKeyInt);
            x264Properties.setSceneCut(this.sceneCut);
            x264Properties.setbFrames(this.bFrames);
            x264Properties.setbAdapt(this.bAdapt);
            x264Properties.setQp(this.qp);
            x264Properties.setBitrate(this.bitrate);
            x264Properties.setbFrameBias(this.bFrameBias);
            x264Properties.setCrf(this.crf);
            x264Properties.setQpStep(this.qpStep);
            x264Properties.setPbRatio(this.pbRatio);
            x264Properties.setChromaOffset(this.chromaOffset);
            x264Properties.setRateTol(this.rateTol);
            x264Properties.setPass(this.pass);
            x264Properties.setStats(this.stats);
            x264Properties.setDirect(this.direct);
            x264Properties.setMeRange(this.meRange);
            x264Properties.setWeightB(this.weightB);
            x264Properties.setNoFastPSkip(this.noFastPSkip);
            return x264Properties;
        }
    }

    @Override
    public String toString() {
        return "X264Properties{" +
                "keyInt=" + keyInt +
                ", minKeyInt=" + minKeyInt +
                ", sceneCut=" + sceneCut +
                ", bFrames=" + bFrames +
                ", bAdapt=" + bAdapt +
                ", qp=" + qp +
                ", bitrate=" + bitrate +
                ", bFrameBias=" + bFrameBias +
                ", crf=" + crf +
                ", qpStep=" + qpStep +
                ", pbRatio=" + pbRatio +
                ", chromaOffset=" + chromaOffset +
                ", rateTol=" + rateTol +
                ", pass=" + pass +
                ", stats=" + stats +
                ", direct=" + direct +
                ", meRange=" + meRange +
                ", weightB=" + weightB +
                ", noFastPSkip=" + noFastPSkip +
                '}';
    }
}
