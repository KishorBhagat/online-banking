package org.example.onlineBankingSystem.model;

public record Bank(
    Long bankId,
    String bankName,
    String ifscCode,
    String branch,
    String address
) {}