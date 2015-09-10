package net.seninp.gi.rulepruner;

public class SampledPoint {

  int window;
  int paa;
  int alphabet;
  double approxDist;
  int grammarSize;
  int grammarRules;
  int compressedGrammarSize;
  int prunedRules;
  boolean isCovered;
  double coverage;
  double reduction;
  private int maxFrequency;

  public int getWindow() {
    return window;
  }

  public void setWindow(int window) {
    this.window = window;
  }

  public int getPAA() {
    return paa;
  }

  public void setPAA(int paa) {
    this.paa = paa;
  }

  public int getAlphabet() {
    return alphabet;
  }

  public void setAlphabet(int alphabet) {
    this.alphabet = alphabet;
  }

  public double getApproxDist() {
    return approxDist;
  }

  public void setApproxDist(double approxDist) {
    this.approxDist = approxDist;
  }

  public int getGrammarSize() {
    return grammarSize;
  }

  public void setGrammarSize(int grammarSize) {
    this.grammarSize = grammarSize;
  }

  public int getGrammarRules() {
    return grammarRules;
  }

  public void setGrammarRules(int grammarRules) {
    this.grammarRules = grammarRules;
  }

  public int getCompressedGrammarSize() {
    return compressedGrammarSize;
  }

  public void setCompressedGrammarSize(int compressedGrammarSize) {
    this.compressedGrammarSize = compressedGrammarSize;
  }

  public int getPrunedRules() {
    return prunedRules;
  }

  public void setPrunedRules(int prunedRules) {
    this.prunedRules = prunedRules;
  }

  public boolean isCovered() {
    return isCovered;
  }

  public void setCovered(boolean isCovered) {
    this.isCovered = isCovered;
  }

  public double getCoverage() {
    return coverage;
  }

  public void setCoverage(double coverage) {
    this.coverage = coverage;
  }

  public double getReduction() {
    return reduction;
  }

  public void setReduction(double reduction) {
    this.reduction = reduction;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + alphabet;
    long temp;
    temp = Double.doubleToLongBits(approxDist);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    result = prime * result + compressedGrammarSize;
    temp = Double.doubleToLongBits(coverage);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    result = prime * result + grammarRules;
    result = prime * result + grammarSize;
    result = prime * result + (isCovered ? 1231 : 1237);
    result = prime * result + maxFrequency;
    result = prime * result + paa;
    result = prime * result + prunedRules;
    temp = Double.doubleToLongBits(reduction);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    result = prime * result + window;
    return result;
  }

  public void setMaxFrequency(int maxFreq) {
    this.maxFrequency = maxFreq;
  }

  public int getPaa() {
    return paa;
  }

  public void setPaa(int paa) {
    this.paa = paa;
  }

  public int getMaxFrequency() {
    return maxFrequency;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    SampledPoint other = (SampledPoint) obj;
    if (alphabet != other.alphabet)
      return false;
    if (Double.doubleToLongBits(approxDist) != Double.doubleToLongBits(other.approxDist))
      return false;
    if (compressedGrammarSize != other.compressedGrammarSize)
      return false;
    if (Double.doubleToLongBits(coverage) != Double.doubleToLongBits(other.coverage))
      return false;
    if (grammarRules != other.grammarRules)
      return false;
    if (grammarSize != other.grammarSize)
      return false;
    if (isCovered != other.isCovered)
      return false;
    if (maxFrequency != other.maxFrequency)
      return false;
    if (paa != other.paa)
      return false;
    if (prunedRules != other.prunedRules)
      return false;
    if (Double.doubleToLongBits(reduction) != Double.doubleToLongBits(other.reduction))
      return false;
    if (window != other.window)
      return false;
    return true;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("SampledPoint [window=").append(window).append(", paa=").append(paa)
        .append(", alphabet=").append(alphabet).append(", approxDist=").append(approxDist)
        .append(", grammarSize=").append(grammarSize).append(", grammarRules=").append(grammarRules)
        .append(", compressedGrammarSize=").append(compressedGrammarSize).append(", prunedRules=")
        .append(prunedRules).append(", isCovered=").append(isCovered).append(", coverage=")
        .append(coverage).append(", reduction=").append(reduction).append(", maxFrequency=")
        .append(maxFrequency).append("]");
    return builder.toString();
  }

}
